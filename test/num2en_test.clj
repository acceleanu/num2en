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

(deftest convert-ntys-test
  (is (= (num2en 20) "twenty"))
  (is (= (num2en 30) "thirty"))
  (is (= (num2en 40) "forty"))
  (is (= (num2en 50) "fifty"))
  (is (= (num2en 60) "sixty"))
  (is (= (num2en 70) "seventy"))
  (is (= (num2en 80) "eighty"))
  (is (= (num2en 90) "ninety"))
  )

(deftest convert-two-digit-test
  (is (= (num2en 21) "twenty-one"))
  (is (= (num2en 32) "thirty-two"))
  (is (= (num2en 43) "forty-three"))
  (is (= (num2en 54) "fifty-four"))
  (is (= (num2en 65) "sixty-five"))
  (is (= (num2en 76) "seventy-six"))
  (is (= (num2en 87) "eighty-seven"))
  (is (= (num2en 98) "ninety-eight"))
  )

(deftest convert-hundreds-test
  (is (= (num2en 100) "one hundred"))
  (is (= (num2en 200) "two hundred"))
  (is (= (num2en 300) "three hundred"))
  (is (= (num2en 400) "four hundred"))
  (is (= (num2en 500) "five hundred"))
  (is (= (num2en 600) "six hundred"))
  (is (= (num2en 700) "seven hundred"))
  (is (= (num2en 800) "eight hundred"))
  (is (= (num2en 900) "nine hundred"))
  )

(deftest convert-three-digit-test
  (is (= (num2en 122) "one hundred and twenty-two"))
  (is (= (num2en 233) "two hundred and thirty-three"))
  (is (= (num2en 345) "three hundred and forty-five"))
  (is (= (num2en 497) "four hundred and ninety-seven"))
  (is (= (num2en 589) "five hundred and eighty-nine"))
  (is (= (num2en 672) "six hundred and seventy-two"))
  (is (= (num2en 763) "seven hundred and sixty-three"))
  (is (= (num2en 892) "eight hundred and ninety-two"))
  (is (= (num2en 999) "nine hundred and ninety-nine"))
  )

(deftest convert-thousands-test
  (is (= (num2en 1000) "one thousand"))
  )

(deftest number-out-of-range-test
  (is (= (num2en 1001) "TODO"))
  (is (= (num2en -1) "TODO"))
  )

(deftest parse-int-test
  (is (= (parse-int "0") 0))
  (is (= (parse-int "987654567") 987654567))
 )

