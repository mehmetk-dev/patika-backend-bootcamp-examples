-- film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama
-- film uzunluğundan fazla kaç tane film vardır?

SELECT COUNT(*) from film
WHERE length >
(
SELECT AVG(length) from film
);

-- film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

SELECT COUNT(*) FROM film
WHERE rental_rate = 
(
SELECT MAX(rental_rate) from film
);

-- film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine
-- sahip filmleri sıralayınız.

SELECT title FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film )
AND replacement_cost = (SELECT MIN(replacement_cost) from film);

-- payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

SELECT customer_id
FROM payment
GROUP BY customer_id
ORDER BY COUNT(*) DESC
LIMIT 5;
