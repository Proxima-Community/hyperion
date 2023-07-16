import time

print("fard")
time.sleep(2)
xpos = float(input("X Position?"))
ypos = float(input("Y Position?"))
zpos = float(input("Z Position?"))
def project(x,y,z):
    return str(x/z), str(y/z)
print("The projected point is at", str(project(xpos,ypos,zpos)))
time.sleep(2)
input("Press enter to close")
# it isn't much but you gotta start somewhere