(ns render
  (:require [formform.calc :as calc]))

(defn render-test []
  [:div
   [:h2 "Test"]
   [:pre (str (calc/inv :U))]]) ;; should just render `:I`

