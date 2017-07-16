(ns num2en
  (:require
    [clojure.tools.cli :as cli]
    )
  (:gen-class)
  )

(defn num2en
  ([n]
   (let [
         under20 {
                  0  "zero",
                  1  "one",
                  2  "two",
                  3  "three",
                  4  "four",
                  5  "five",
                  6  "six",
                  7  "seven",
                  8  "eight",
                  9  "nine",
                  10 "ten",
                  11 "eleven",
                  12 "twelve",
                  13 "thirteen",
                  14 "fourteen",
                  15 "fifteen",
                  16 "sixteen",
                  17 "seventeen",
                  18 "eighteen",
                  19 "nineteen"
                  }
         ntys {
               20 "twenty",
               30 "thirty",
               40 "forty",
               50 "fifty",
               60 "sixty",
               70 "seventy",
               80 "eighty",
               90 "ninety"
               }

         ]
     (cond
       (or (< n 0) (> n 1000)) "TODO"
       (< n 20) (under20 n)
       (and (< n 100) (= (rem n 10) 0)) (ntys n)
       (< n 100) (str (ntys (* (quot n 10) 10)) \- (under20 (rem n 10)))
       (and (< n 1000) (= (rem n 100) 0)) (str (under20 (quot n 100)) " hundred")
       (< n 1000) (str (num2en (* 100 (quot n 100))) " and " (num2en (rem n 100)))
       (= n 1000) "one thousand"
       )
     )
    )
  )

(defn parse-int [n]
  (Integer. n))

(defn -main
  "Represent the given number in english words"
  ([]
   (println "Usage: num2en <number>")
    )
  ([n & args]
   (let [n (parse-int n)
         numberAsString (num2en n)
         ]
     (if (= numberAsString "TODO")
       (println (str "Number " n " is not in [1..1000]"))
       (println numberAsString)
       )
     )
    )
  )
