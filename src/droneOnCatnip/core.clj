(ns clj-drone.example
  (:use clj-drone.core))

(defn flyflyfly "Jeg flyr i tre sekunder" []
  ;(do
   (drone-initialize)
   ;(drone :take-off)
   (println "flyr...")
   (Thread/sleep 2000)
   ;(drone :land)
   (println "inn for landing"
;)
   ))
(flyflyfly)
