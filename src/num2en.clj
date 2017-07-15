(ns num2en
  (:require
    [clojure.tools.cli :as cli]
    )
  (:gen-class)
  )

(defn num2en
  ([n]
    (cond
      (= n 0)  "zero"
      (= n 1)  "one"
      (= n 2)  "two"
      (= n 3)  "three"
      (= n 4)  "four"
      (= n 5)  "five"
      (= n 6)  "six"
      (= n 7)  "seven"
      (= n 8)  "eight"
      (= n 9)  "nine"
      (= n 10) "ten"
      :else "TODO"
    )
  )
)

(defn parse-int [n]
  (Integer. n))

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
