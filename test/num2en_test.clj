(ns num2en-test
  (:use clojure.test)
  (:use num2en))

(deftest convert-numbers-0-19-test
  (is (= (num2en 0) "zero"))
  (is (= (num2en 1) "one"))
  (is (= (num2en 2) "two"))
  (is (= (num2en 3) "three"))
  (is (= (num2en 4) "four"))
  (is (= (num2en 5) "five"))
  (is (= (num2en 6) "six"))
  (is (= (num2en 7) "seven"))
  (is (= (num2en 8) "eight"))
  (is (= (num2en 9) "nine"))
  (is (= (num2en 10) "ten"))
  (is (= (num2en 11) "eleven"))
  (is (= (num2en 12) "twelve"))
  (is (= (num2en 13) "thirteen"))
  (is (= (num2en 14) "fourteen"))
  (is (= (num2en 15) "fifteen"))
  (is (= (num2en 16) "sixteen"))
  (is (= (num2en 17) "seventeen"))
  (is (= (num2en 18) "eighteen"))
  (is (= (num2en 19) "nineteen"))
  (is (= (num2en 20) "twenty"))
  )

(deftest parse-int-test
  (is (= (parse-int "0") 0))
  (is (= (parse-int "987654567") 987654567))
 )

