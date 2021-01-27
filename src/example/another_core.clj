(ns example.another-core)

(defn another_function
  "docstring"
  [parameter]
  (try
    (if (even? (Integer/parseInt parameter))
      (str "Number " parameter " is even.")
      (str "Number " parameter " is NOT even."))
    (catch Exception NumberFormatException
      (str parameter " is not a number!")
      ))
  )

