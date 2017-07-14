(ns num2en)

(defn num2en
  ([] "Usage: num2en <number>")
  ([n]
   (cond
     (= n 0) "zero"
     (= n 1) "one"
     :else "TODO"
     )
    )
  )


