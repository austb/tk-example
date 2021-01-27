(ns example.another-service
  (:require [clojure.tools.logging :as log]
            [example.another-core :as core]
            [puppetlabs.trapperkeeper.core :as trapperkeeper]))

(defprotocol AnotherService
  (is_number_even [this number]))

(trapperkeeper/defservice another-service

  AnotherService
  []
  (init [this context]
        (log/info "initializing another service") context)
  (start [this context]
         (log/info "starting another service") context)
  (stop [this context]
        (log/info "stopping another service") context)

  (is_number_even [this number]
                  (core/another_function number)))
