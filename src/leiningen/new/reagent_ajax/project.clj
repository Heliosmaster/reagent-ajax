(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.439"]
                 [ring "1.7.1"]
                 [mount "0.1.15"]
                 [compojure "1.6.1"]
                 [ring-middleware-format "0.7.3"]
                 [org.slf4j/slf4j-log4j12 "1.7.25"]]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :source-paths ["src/clj" "src/cljs"]
  :test-paths ["test/clj" "test/cljs"]
  :resource-paths ["resources" "generated"]

  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.18"]
                                  [cljs-ajax "0.8.0"]
                                  [binaryage/devtools "0.9.10"]
                                  [reagent "0.8.1"]]
                   :source-paths ["dev/clj" "dev/cljs"]
                   :resource-paths ["dev/resources"]}
             :uberjar {:main {{ns-name}}.core
                       :omit-source true
                       :aot :all
                       :source-paths ["src/clj" "src/cljs"]
                       :uberjar-name "{{ns-name}}.jar"}}
  :template-additions [".gitignore" "resources/public/index.html"]
  :cljsbuild {:builds
              {:dev {:source-paths ["dev/cljs" "src/cljs"]
                     :figwheel {:on-jsload {{ns-name}}.dev/on-jsload}
                     :compiler {:output-to "generated/public/js/app.js"
                                :output-dir "generated/public/js/out"
                                :source-map true
                                :asset-path "/js/out"
                                :main {{ns-name}}.core
                                :optimizations :none
                                :preloads [devtools.preload]}}
               :prod
                    {:source-paths ["src/cljs"]
                     :compiler {:output-to "generated/public/js/app.js"
                                :optimizations :advanced
                                :pretty-print false}}}}

  :figwheel {:css-dirs ["generated/public/css"]}
  :clean-targets ^{:protect false} [:target-path])
