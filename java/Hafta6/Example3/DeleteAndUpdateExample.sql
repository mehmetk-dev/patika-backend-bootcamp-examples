-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), 
--birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.


-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET name = 'Mehmet KEREM',
	birthday = '2010-10-10',
	email = 'email@gmail.com'
WHERE id = 33;

UPDATE employee
SET id ='323',
	name = 'Emre Taş',
	birthday = '1999-01-10'
WHERE email LIKE 'bmedwell1%';

UPDATE employee
SET id = '55',
	birthday = '2011-10-11',
	email = 'eposta@gmail.com'
WHERE name LIKE 'Sylas %';

UPDATE employee
SET id = '3141',
	name = 'Burak Özçivit',
	email = 'burakabi@gmail.com'
WHERE birthday = '1949-12-07';

UPDATE employee
SET name = 'Enes Duman',
	birthday = '2022-10-10',
	email = 'enesduman@gmail.com'
WHERE id = 35;

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee
WHERE id = 31;

DELETE FROM employee
WHERE id = 32;

DELETE FROM employee
WHERE name = 'Enes Duman';

DELETE FROM employee
WHERE birthday = '1917-02-25';

DELETE FROM employee 
WHERE email LIKE 'ajanatka19%';

select * from employee