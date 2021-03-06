#!/bin/bash
#Author: 柠檬班可优
#Date: 2019-06-06
#install docker in ubuntu and centos

function install_docker_in_ubuntu
{
    sudo  apt-get update -y
    # install some tools
    sudo apt-get install
        apt-transport-https
        ca-certificates
        curl
        gnupg-agent
        software-properties-common
        net-tools
        wget -y

    # install docker
    curl -fsSL get.docker.com -o get-docker.sh
    sh get-docker.sh

    # start docker service
    sudo groupadd docker &> /dev/null
    sudo gpasswd -a "${USER}" docker
    sudo systemctl start docker

    rm -rf get-docker.sh
}


function install_docker_in_centos
{
    # install some tools
    sudo yum install -y git vim gcc glibc-static telnet bridge-utils

    # install docker
    curl -fsSL get.docker.com -o get-docker.sh
    sh get-docker.sh

    # start docker service
    sudo groupadd docker &> /dev/null
    sudo gpasswd -a "${USER}" docker
    sudo systemctl start docker

    rm -rf get-docker.sh

}


SYSTEM_NAME="$(awk -F= '/^NAME/{print $2}' /etc/os-release)"
if [[ "${SYSTEM_NAME,,}" =~ "ubuntu"  ]] ; then
    echo "Your system is ubuntu."
    echo "Installing Docker in ubuntu..."
    install_docker_in_ubuntu
elif [[ "${SYSTEM_NAME,,}" =~ "centos" ]] ; then
    echo "Your system is centos."
    echo "Installing Docker in centos..."
    install_docker_in_centos
else
    echo "This script can only run in ubuntu and centos system."
    exit 1
fi