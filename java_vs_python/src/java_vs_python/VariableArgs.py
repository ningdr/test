
def variable_test(arg1, *args):
    print(arg1)
    if len(args) > 0:
        for arg in args:
            print(arg)


variable_test("111")
variable_test("222", 1, 2, 3, 4)
