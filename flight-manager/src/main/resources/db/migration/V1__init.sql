CREATE TABLE "assignment"
(
    "id"          BIGSERIAL PRIMARY KEY,
    "employee_id" BIGINT NOT NULL,
    "pairing_id"  BIGINT NOT NULL,
    "rank"        VARCHAR(10)
);

CREATE TABLE "flight"
(
    "id"                  BIGINT PRIMARY KEY,
    "flight_num"          INTEGER     NOT NULL,
    "station_departure"   VARCHAR(10) NOT NULL,
    "station_arrival"     VARCHAR(10) NOT NULL,
    "date_time_departure" VARCHAR(30) NOT NULL,
    "date_time_arrival"   VARCHAR(30) NOT NULL
);

CREATE TABLE "employee"
(
    "id"     BIGSERIAL PRIMARY KEY,
    "gender" VARCHAR(10) NOT NULL,
    "fleet"  VARCHAR(10)
);

CREATE TABLE "paring_flight"
(
    "paring_id" BIGINT NOT NULL,
    "flight_id" BIGINT NOT NULL
);
CREATE TABLE "pairing"
(
    "id"              BIGSERIAL PRIMARY KEY,
    "fleet"           VARCHAR(30),
    "date_time_start" VARCHAR(30) NOT NULL,
    "date_time_end"   VARCHAR(30) NOT NULL
);

CREATE TABLE "duty"
(
    "id"              BIGSERIAL PRIMARY KEY,
    "date_time_start" VARCHAR(30) NOT NULL,
    "date_time_end"   VARCHAR(30) NOT NULL,
    "pairing_id"      BIGINT      NOT NULL
);

CREATE TABLE "leg"
(
    "id"        BIGSERIAL PRIMARY KEY,
    "duty_id"   BIGINT      NOT NULL,
    "flight_id" BIGINT      NOT NULL,
    "type"      VARCHAR(30) NOT NULL
);

ALTER TABLE
    "assignment"
    ADD CONSTRAINT "assignment_pairing_id_foreign" FOREIGN KEY ("pairing_id") REFERENCES "pairing" ("id");
ALTER TABLE
    "assignment"
    ADD CONSTRAINT "assignment_employee_id_foreign" FOREIGN KEY ("employee_id") REFERENCES "employee" ("id");
ALTER TABLE
    "paring_flight"
    ADD CONSTRAINT "paring_flight_flight_id_foreign" FOREIGN KEY ("flight_id") REFERENCES "flight" ("id");
ALTER TABLE
    "duty"
    ADD CONSTRAINT "duty_pairing_id_foreign" FOREIGN KEY ("pairing_id") REFERENCES "pairing" ("id");
ALTER TABLE
    "leg"
    ADD CONSTRAINT "leg_flight_id_foreign" FOREIGN KEY ("flight_id") REFERENCES "flight" ("id");
ALTER TABLE
    "leg"
    ADD CONSTRAINT "leg_duty_id_foreign" FOREIGN KEY ("duty_id") REFERENCES "duty" ("id");
ALTER TABLE
    "paring_flight"
    ADD CONSTRAINT "paring_flight_paring_id_foreign" FOREIGN KEY ("paring_id") REFERENCES "pairing" ("id");