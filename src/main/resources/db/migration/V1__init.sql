CREATE TABLE plane (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  model VARCHAR(50) NOT NULL,
  capacity INT NOT NULL,
  max_distance INT NOT NULL,
  status VARCHAR(20) DEFAULT 'Ready',
  PRIMARY KEY (id)
)