DELETE FROM player_alias;
INSERT INTO player_alias
(alias, name)
VALUES
   ('Alejandro Gomez', 'Alejandro Gomez Gb42'),
   ('Alexandar Lazov', 'Alexander Lazov'),
   ('Alexandru Jecan', 'Mircea Alexandru Jecan'),
   ('Alafia Ayeni', 'Olukayode Alafia Damina Ayeni'),
   ('Andre Thielemans', 'Andre Tielemans'),
   ('Andre Zietsman', 'Andre Zietsmann'),
   ('Andres Artunedo Martinavarro', 'Andres Artunedo Martinavarr'),
   ('Antoine Hoang', 'Antonie Hoang'),
   ('Axel Geuer', 'Alex Geuer'),
   ('Albert Ramos Vinolas', 'Albert Ramos'),
   ('William Freer', 'Bill Freer'),
   ('Ben Patael', 'Ben Fatael'),
   ('Bob Weise', 'Bob Weise W055'),
   ('Brendan OShea', 'Bill Oshea'),
   ('Carlos Alcaraz', 'Carlos Alcaraz Garfia'),
   ('Chris Lewis', 'Chris Lewis Nzl'),
   ('Chris Lewis (NZL)', 'Chris Lewis Nzl'),
   ('Christofer Delaney', 'Chris Delaney'),
   ('Cristian Garin', 'Christian Garin'),
   ('Christopher O''Connell', 'Christopher Oconnell'),
   ('Clive Brebnor', 'Clive S Brebnor'),
   ('Colin Diederichs', 'C Diederichs'),
   ('Daniel Elahi Galan', 'Daniel Elahi Galan Riveros'),
   ('Dave Phillips', 'David D Phillips'),
   ('Diego Schwartzman', 'Diego Sebastian Schwartzman'),
   ('Duckhee Lee', 'Duck Hee Lee'),
   ('Elio Lito Alvarez', 'Lito Alvarez'),
   ('Eugene Cantin', 'Eugene T Cantin'),
   ('Evgenii Tiurnev', 'Evgeny Tyurnev'),
   ('Frances Tiafoe', 'Francis Tiafoe'),
   ('Franko Skugor', 'Franco Skugor'),
   ('Fred Hemmes Sr', 'Fred Hemmes'),
   ('Fred Gil', 'Frederico Gil'),
   ('Fred McNair IV', 'Fred Mcnair'),
   ('Freddy Field', 'N Field'),
   ('Giovanni Capozza', 'Gianni Capozza'),
   ('Graham Primrose', 'Graham B Primrose'),
   ('Hans Joachim Ploetz', 'Hans Jaochim Plotz'),
   ('Hans Jurgen Pohmann', 'Han Jurgen Pohmann'),
   ('Henry Pfister', 'Hank Pfister'),
   ('Henry (Hank) Irvine', 'Henry Hank Irvine'),
   ('Harry Sheridan', 'H Sheridan'),
   ('Herbert Browne', 'Herbert H Browne Jr'),
   ('J J Wolf', 'Jeffrey John Wolf'),
   ('Jairo Velasco Sr', 'Jairo Velasco'),
   ('Joao Menezes', 'Joao Lucas Magalhaes Hueb De Menezes'),
   ('Johan Tatlot', 'Johan Sebastien Tatlot'),
   ('Johnny Muller', 'John Muller'),
   ('Jordan Correia', 'Jordan Correia Passos Do Carmo'),
   ('Jorge Panta', 'Jorge Brian Panta Herreros'),
   ('Jose Edison Mandarino', 'Jose Mandarino'),
   ('Juan Luis Rascon Lope', 'Juan Luis Tati Rascon'),
   ('Juan Pablo Varillas', 'Juan Pablo Varillas Patino Samudio'),
   ('Keith A Carpenter', 'Keith Carpenter'),
   ('Inigo Cervantes', 'Inigo Cervantes Huegun'),
   ('Ivor Warwick', 'Ivor J Warwick'),
   ('Jaime Fillol Sr', 'Jaime Fillol'),
   ('Jamie Presslie', 'James Pressly'),
   ('John Satchwell Smith', 'Sj Smith'),
   ('Jose Antonio (Pepe) Conde', 'Jose Antonio Pepe Conde'),
   ('Jose Hernandez Fernandez', 'Jose Hernandez'),
   ('Jose A Moreno', 'Jose Moreno'),
   ('Jose Statham', 'Jose Rubin Statham'),
   ('Joseph Case', 'Joseph M Case'),
   ('Juan Gisbert Sr', 'Juan Gisbert'),
   ('Junjo Kawamuri', 'Junzo Kawamori'),
   ('Jurabek Karimov', 'Djurabek Karimov'),
   ('Khumoyun Sultanov', 'Khumoun Sultanov'),
   ('Lester Brown', 'Lr Brown'),
   ('Lloyd Harris', 'Lloyd George Muirhead Harris'),
   ('Marcelo Lara', 'Marcello Lara'),
   ('Matthias A Muller', 'Matthias Muller'),
   ('Michael Brown', 'Michael Brown B395'),
   ('Miloslav Mecir Sr', 'Miloslav Mecir'),
   ('Moez Echargui', 'Moez Chargui'),
   ('Mubarak Shannan Zayid', 'Mubarak Zaid'),
   ('M Munoz', 'Miguel Cordefors Munoz'),
   ('Niclas Kroon', 'Nicklas Kroon'),
   ('Oscar Burrieza Lopez', 'Oscar Burrieza'),
   ('Oscar Rodriguez', 'Oscar Rodriguez Arg'),
   ('Pancho JF Guzman', 'Pancho Guzman'),
   ('Patricio Rodriguez', 'Patricio Rodriguez Chi'),
   ('Pedro Martinez', 'Pedro Martinez Portero'),
   ('Ricardo Rodriguez  Pace', 'Ricardo Rodriguez'),
   ('Richard Dick Knight', 'Dick Knight'),
   ('Rick Meyer', 'Rick Meyers'),
   ('Robert Casey', 'Robert Casey C100'),
   ('Roberto Cid Subervi', 'Roberto Cid'),
   ('Roland Russo', 'Ronald Russo'),
   ('Rubin Statham', 'Jose Rubin Statham'),
   ('Rudolf Hoskowetz', 'Ruby Hoskowetz'),
   ('Sam Groth', 'Samuel Groth'),
   ('Sasikumar Mukund', 'Sasi Kumar Mukund'),
   ('Soonwoo Kwon', 'Soon Woo Kwon'),
   ('Stan Wawrinka', 'Stanislas Wawrinka'),
   ('Stanislas Wawrinka', 'Stan Wawrinka'),
   ('Steven Turner', 'Steve Turner'),
   ('Taylor Fritz', 'Taylor Harry Fritz'),
   ('Thomas Koch', 'Thomaz Koch'),
   ('Thomas Strengberger', 'Thomas Strengberger S597'),
   ('T J Middleton', 'Tj Middleton'),
   ('Quentin Robert', 'Robert Quentin'),
   ('Victor Estrella Burgos', 'Victor Estrella'),
   ('Victor Palman', 'Viktor Palman'),
   ('William Krulewitz', 'Steve Krulevitz'),
   ('Yaraslav Shyla', 'Yaraslau Shyla'),
   ('Yuya Kibi', 'Yuuya Kibi');

CALL create_player('Alan', 'Koth', NULL, '???');
CALL create_player('Ashley', 'Hewitt', NULL, 'GBR');
CALL create_player('B', 'Kin', NULL, 'KOR');
CALL create_player('Bruno', 'Chimenti', DATE '1942-01-02', 'ITA');
CALL create_player('C', 'Diederichs', NULL, 'RSA');
CALL create_player('Cecil', 'Pedlow', NULL, 'IRL');
CALL create_player('Colin', 'Rees', NULL, 'RSA');
CALL create_player('Cole', 'Gromley', '1999-12-26', 'USA');
CALL create_player('Dennis', 'Foley', NULL, 'IRL');
CALL create_player('Don', 'Bitler', NULL, 'USA');
CALL create_player('Douglas', 'Irvine', NULL, 'ZIM');
CALL create_player('Francesco', 'Forti', DATE '1999-07-26', 'ITA');
CALL create_player('Giuseppe', 'Belli', DATE '1951-01-08', 'ITA');
CALL create_player('Harry', 'Barniville', NULL, 'IRL');
CALL create_player('Ivan', 'Mikysa', NULL, 'USA');
CALL create_player('Jack', 'Lowe', NULL, 'USA');
CALL create_player('Jim', 'Oescher', NULL, 'USA');
CALL create_player('Jiri', 'Medonos', NULL, 'CZE');
CALL create_player('Lewis', 'Sylvester', DATE '1941-11-04', 'RSA');
CALL create_player('Lornie', 'Kuhle', NULL, 'RSA');
CALL create_player('Louis', 'Pretorius', NULL, 'RSA');
CALL create_player('Mauro', 'Rezzonico', DATE '1944-12-23', 'ITA');
CALL create_player('Milan', 'Vopicka', NULL, 'CZE');
CALL create_player('Norman', 'Schellenger', NULL, 'USA');
CALL create_player('Omar', 'Alawadhi', DATE '1982-01-16', 'UAE');
CALL create_player('Peter', 'Rigg', DATE '1948-10-25', 'AUS');
CALL create_player('Philip', 'Holton', NULL, 'AUS');
CALL create_player('Ryoichi', 'Miyake', NULL, 'JPN');
CALL create_player('V', 'Rudj', NULL, 'RUS');
CALL create_player('William', 'Lloyd', DATE '1949-05-07', 'AUS');
CALL create_player('Win', 'Irwin', NULL, 'USA');

COMMIT;
