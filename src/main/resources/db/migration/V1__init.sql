CREATE TABLE plane (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  model varchar(100) NOT NULL,
  capacity int NOT NULL,
  max_distance int NOT NULL,
  status varchar(100) DEFAULT 'Ready',
  PRIMARY KEY (id)
)