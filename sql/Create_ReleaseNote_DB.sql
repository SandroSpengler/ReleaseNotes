create table release_note (
	release_id bigint primary key,
	release_note_version varchar(255),
	title varchar(1023) 
);

create table release_summary (
	summary_id bigint primary key,
	release_id bigint,
	headline varchar,
	content varchar,
	constraint fk_release_id
		foreign key(release_id)
		references release_note(release_id)
);

create table ui_change (
	ui_id bigint primary key,
	release_id bigint,
	name varchar,
	constraint fk_release_id
		foreign key(release_id)
		references release_note(release_id)
);

create table adjusted_elements (
	ae_id bigint primary key,
	ui_id bigint,
	description varchar,
	constraint fk_ui_id
		foreign key(ui_id)
		references ui_change(ui_id)
);
