(ns num2en
  (:require
    [clojure.tools.cli :as cli]
    )
  (:gen-class)
  )

(defn num2en
  ([n]
    (cond
      (= n 0) "zero"
      (= n 1) "one"
      :else "TODO"
    )
  )
)

(defn parse-int [n]
  (Integer/parseInt n))

(defn -main
  "Represent the given number in english words"
  ( []
    (println "Usage: num2en <number>")
  )
  ( [n & args]
    (println
       (num2en  (parse-int n))
    )
  )
)
