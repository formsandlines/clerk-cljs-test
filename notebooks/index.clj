(ns notebooks.index
  (:require [nextjournal.clerk :as clerk]))

(def test-viewer
  {:render-fn 'render/render-test
   :require-cljs true
   :transform-fn clerk/mark-presented})

(clerk/with-viewer test-viewer
  nil)
