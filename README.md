Run for docker (Postgresdb DB):
- First of all we should run this command :<br>
`docker container run --name postgresdb -e POSTGRES_PASSWORD=admin -d -p 5432:5432 postgres`
- copy the sql file to the root dir of the container <br>
`docker cp expensetracker_db.sql postgresdb:/ `

-   Enter the bash container :<br>
`docker container exec -it postgresdb bash`

- Now after entering the container execute the SQL file:
`psql -U postgres --file expensetracker_db.sql`