(ns user
  (:require [nextjournal.clerk :as clerk]
            [clojure.string]))

(comment
  (clerk/serve! {:watch-paths ["notebooks"] :browse? true :port 7878})


  ;; start without file watcher, open browser when started
  (clerk/serve! {:browse? true :port 7878})

  ;; start with file watcher for these sub-directory paths
  (clerk/serve! {:watch-paths ["notebooks"]})

  ;; start with file watcher and a `show-filter-fn` function to watch
  ;; a subset of notebooks
  (clerk/serve! {:watch-paths ["notebooks"]
                 :show-filter-fn #(clojure.string/starts-with? % "notebooks")})

  (clerk/clear-cache!)
  ;;
  )
