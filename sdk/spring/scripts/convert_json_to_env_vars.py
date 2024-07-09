import json
import os
import sys


def convert_json_to_env_vars(json_file_path):
    try:
        # Read the JSON file
        with open(json_file_path, "r") as json_file:
            data = json.load(json_file)

        # Convert JSON keys and values to environment variables
        for key, value in data.items():
            os.environ[key] = str(value)

        print(f"Environment variables set from {json_file_path}:")
        for key, value in os.environ.items():
            print(f"{key}={value}")
    except FileNotFoundError:
        print(f"Error: File '{json_file_path}' not found.")


if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python convert_json_to_env_vars.py <json_file>")
        sys.exit(1)

    json_file_path = sys.argv[1]
    convert_json_to_env_vars(json_file_path)
