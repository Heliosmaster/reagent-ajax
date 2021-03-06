(ns leiningen.new.reagent-ajax
  (:use [leiningen.new.templates :only [multi-segment renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "reagent-ajax"))

(defn reagent-ajax
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data
             ["test/clj/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
             ["src/clj/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src/clj/{{sanitized}}/server.clj" (render "server.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore")]
             ["dev/clj/user.clj" (render "user.clj" data)]
             ["src/cljs/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["resources/log4j.properties" (render "log4j.properties" data)]
             ["resources/public/index.html" (render "index.html" data)]
             ["resources/public/css/screen.css" (render "screen.css")])))
