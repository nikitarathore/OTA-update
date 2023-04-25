import mnist_loader
import network2


training_data, validation_data, test_data = mnist_loader.load_data_wrapper()
net = network2.Network([784, 30, 30, 10,10,10])#change the number of layers or number of neurons in each layer here
validation_data = list(validation_data)
training_data = list(training_data)

loaded_model = network2.load("WeightsAndBiases.txt")
loaded_results = loaded_model.accuracy(test_data)

print("loaded_results:",loaded_results)
