(ns projecteuler01)

(comment
  Multiples of 3 and 5
  Problem 1
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.
)


(defn is-multiple
  [n]
  (cond
    (= (rem n 3) 0) true
    (= (rem n 5) 0) true
    :else false)
)

(apply + (filter is-multiple (range 1 1000)))
