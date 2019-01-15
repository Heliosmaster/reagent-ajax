(ns {{ns-name}}.server
  (:require [ring.util.response :as response]
            [compojure.route :as route]
            [compojure.core :refer [defroutes GET PUT POST]]
            [mount.core :as mount]
            [ring.middleware.format :as ring-format]
            [ring.adapter.jetty :as jetty]))

(defroutes routes
  (GET "/" req (response/resource-response "index.html" {:root "public"}))
  (GET "/load-stuff" [] {:status 200
                         :body {:something "here"}})
  (route/resources "/")
  (route/not-found "Not found"))


(def app
  (-> routes
      (ring-format/wrap-restful-format)))


(mount/defstate server
  :start (jetty/run-jetty #'app {:join? false
                                 :port 8080})
  :stop (.stop server))

