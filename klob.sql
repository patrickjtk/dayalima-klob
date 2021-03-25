CREATE TABLE `file_attachments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_type` varchar(50) NOT NULL DEFAULT '',
  `file_name` varchar(255) DEFAULT NULL,
  `updated_at` datetime NOT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `attachment_id` int(11) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `attachment_id` FOREIGN KEY (`attachment_id`) 
    REFERENCES `file_attachments` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `klob_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) DEFAULT NULL,
  `attachment_id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `klob_attachment_id` FOREIGN KEY (`attachment_id`) 
    REFERENCES `file_attachments` (`id`),
  CONSTRAINT `klob_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
