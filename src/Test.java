public class Test {
    public static void main(String[] args) {
        System.out.println("难道真的是我想的那样，会发生冲突吗？");

        System.out.println("设想1：未拉取就先修改，修改完后再提交，这样会发生冲突？");
        /**
         * 设想1补充：当不同的对象对GitHub上面相同的文件进行操作，A修改并提交后，B并不知道A已经修改了文件，A修改的时候B也在修改。
         *              等到B修改完后发现在SourceTree推送失败，接着拉取内容发现产生冲突！
         * 经过测试，设想1成立，会发生冲突！SourceTree推送失败！
         * 解决方案设想：
         *      1.将服务器的代码拉取下来，进行代码冲突解决，删除或保留代码！
         */
        System.out.println("设想1成立！");
    }
}
