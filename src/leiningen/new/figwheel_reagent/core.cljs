(ns {{ns-name}}.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defn root-component []
  [:h1 "Hello world!"])


(defn ^:export main []
  (r/render-component
   [root-component]
   (js/document.getElementById "app")))
