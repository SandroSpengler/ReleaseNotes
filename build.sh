echo "creating release_notes"

docker build . -t sandrospengler/release_notes:latest

#echo "pushing image to dockerhub"

#docker push sandrospengler/eloinflater_react:latest

#echo "eloinflater_react has now been published"

#docker run --name releaseNotes -p 5000:5000 -d sandrospengler/release-notes
