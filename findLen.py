class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def append(self, value):
        new_node = Node(value)
        if not self.head:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node

    def print_linked_list(self):
        current = self.head
        while current:
            print(current.value, end=" ")
            current = current.next
        print()

def find_length_of_linked_list(linked_list):
    current = linked_list.head
    length = 0
    while current:
        length += 1
        current = current.next
    return length

# Example Usage
linked_list = LinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)

print("Linked List:")
linked_list.print_linked_list()

length = find_length_of_linked_list(linked_list)
print("Length of the linked list:", length)
