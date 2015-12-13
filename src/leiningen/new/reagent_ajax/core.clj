(ns {{ns-name}}.core
  (:require [{{ns-name}}.server :as server])
  (:gen-class))


(defn start! []
  (server/start!))

(defn -main []
  (start!))
