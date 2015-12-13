(ns {{ns-name}}.dev
  (:require [{{ns-name}}.core :as core]))

(enable-console-print!)

(defn on-jsload []
  (core/main))
