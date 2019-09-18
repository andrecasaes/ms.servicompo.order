#!/bin/bash
dotnet publish OrderConsult.csproj  -c Release -r win-x64 -o publish 
zip publish.zip publish/*
#ncftpput -u administrator -C  server.htcs.com.br     ./publish.zip /mailSent
