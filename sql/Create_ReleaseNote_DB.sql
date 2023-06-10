create table release_note (
	release_id bigint primary key,
	release_note_version varchar(255),
	title varchar(1023) 
)

create table release_summary (
	summary_id bigint primary key,
	release_id bigint,
	headline varchar,
	content varchar,
	constraint fk_release_id
		foreign key(release_id)
		references release_note(release_id)
)
