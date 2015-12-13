(ns {{ns-name}}.core
    (:require [reagent.core :as r]
              [ajax.core :as ajax]))

(enable-console-print!)

(defn root-component []
  (let [loaded-stuff (r/atom nil)]
    (ajax/GET "/load-stuff"
              {:handler (fn [data]
                          (reset! loaded-stuff data))})
    (fn []
      [:div
       [:h1 "Hello world!"]
       [:span "Loaded stuff in the background:" (str @loaded-stuff)]])))

(defn ^:export main []
  (r/render-component
   [root-component]
   (js/document.getElementById "app")))
