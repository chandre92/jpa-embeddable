To create DB container:
docker run --name postgres -v $PATH_TO_VOLUME_ON_HOST:$PATH_TO_STORAGE_INSIDE_CONTAINER -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres
