e=$1


for((i=1;i<=e;i++));
do java Timer.java -w "$2" -b "$3";
done
