# Using Python, have the function xoxo(str) take the str parameter
# being passed and return the string true if there is an equal number of x's and o's,
# because you cannot recieve an uneven number of hugs and kisses :-)
# otherwise return the string false. Only these two letters will be entered in the string,
# no punctuation or numbers.
# For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.

def xoxo(str):
    str = str.lower()
    if str.count("x")==str.count("o"):
        print("TRUE")
    else:
        print ("FALSE")

xoxo("xxoXo")