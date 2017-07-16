(defproject NumberToEnglish "1.0-SNAPSHOT"
  :description "Convert number into eglish words"
  :url "http://github.com/acceleanu/clojure"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/tools.cli "0.2.4"]
                 ]
  :dev-dependencies [[leiningen/lein-swank "1.2.0-SNAPSHOT"]]
  :main num2en
  :aot [num2en]
  )
