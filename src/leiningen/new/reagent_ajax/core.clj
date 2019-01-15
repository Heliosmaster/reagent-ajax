(ns {{ns-name}}.core
  (:require [mount.core :as mount]
            [{{ns-name}}.server :as server])
  (:gen-class))


(defn start! []
  (mount/start))

(defn -main []
  (start!))
