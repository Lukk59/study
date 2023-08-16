FROM node:19-alpine

#  "/x/" cria o folder se n tiver.
COPY package.json /app/
COPY src /app/

# como cd do prompt. muda diretorio.
WORKDIR /app

RUN npm install

# o comeco do ultimo comando, comando, parametro.
CMD ["node", "server.js"]
