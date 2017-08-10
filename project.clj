(defproject NumberToEnglish "1.0-SNAPSHOT"
  :description "Convert number into eglish words"
  :url "http://github.com/acceleanu/clojure"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.clojure/test.check "0.9.0"]]
  :main ^:skip-aot num2en
  :target-path "target/%s"

  :profiles {
    :uberjar {:aot :all}
    :dev {:dependencies [[midje "1.8.3" :exclusions [org.clojure/clojure]]]
          :plugins [[lein-midje "3.2.1"]]}
  })
