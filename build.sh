echo "creating release_notes"

docker build . -t sandrospengler/release_notes:latest

echo "pushing image to dockerhub"

docker push sandrospengler/release_notes:latest

echo "sandrospengler/release_notes has now been published"

#docker run --name releaseNotes -p 10000:10000 -e postgres_username=sandro -e postgres_password=12345asdF -d sandrospengler/release_notes
